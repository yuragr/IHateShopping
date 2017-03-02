package ihate.shopping.utils;

import android.util.Log;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by yurig on 25-Feb-17.
 */

public class MD5Utils {
    private static final String TAG = MD5Utils.class.getSimpleName();

    public String getMD5(File file) throws IOException {
        String result = "";
        FileInputStream fis = null;
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            fis = new FileInputStream(file);

            byte[] dataBytes = new byte[1024];

            int nRead = 0;
            while ((nRead = fis.read(dataBytes)) != -1) {
                md.update(dataBytes, 0, nRead);
            }

            byte[] mdbytes = md.digest();

            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < mdbytes.length; i++) {
                sb.append(Integer.toString((mdbytes[i] & 0xff) + 0x100, 16).substring(1));
            }
        } catch (NoSuchAlgorithmException e) {
            Log.e(TAG, "no MD5 algorithm available", e);
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    Log.e(TAG, "error while closing file input stream", e);
                }
            }
        }
        return result;
    }
}
