/*
 * Copyright madding.me.
 */
package com.madding.shared.encrypt.hash;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;

import com.madding.shared.encrypt.ProviderUtil;
import com.madding.shared.encrypt.cert.bc.constant.MadBCConstant;
import com.madding.shared.encrypt.util.Hex;

/**
 * 类SHA.java的实现描述：TODO 类实现描述
 * 
 * query OID: http://www.oid-info.com/get/2.16.840.1.101.3.4.2.6
 * 
 * @author madding.lip May 8, 2012 2:01:34 PM
 */
public class SHA {

    public static final String DEFAULT_CHARSET = "UTF-8";

    static {
        ProviderUtil.addBCProvider();
    }

    ////// SHA1 ////////////////////////////////////////////////////

    // return 40bit
    public final static String sha(String src) {
        try {
            return sha(src.getBytes(DEFAULT_CHARSET));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return "";
    }

    public final static String sha(byte[] src) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA", MadBCConstant.JCE_PROVIDER);
            md.update(src);
            return new String(Hex.encodeHex(md.digest()));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (NoSuchProviderException e) {
            e.printStackTrace();
        }
        return "";
    }

    // return 40bit
    public final static String sha1(String src) {
        try {
            return sha1(src.getBytes(DEFAULT_CHARSET));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return "";
    }

    public final static String sha1(byte[] src) {
        try {
            // MessageDigest md = MessageDigest.getInstance("SHA-1");
            MessageDigest md = MessageDigest.getInstance("1.3.14.3.2.26", MadBCConstant.JCE_PROVIDER);
            md.update(src);
            return new String(Hex.encodeHex(md.digest()));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (NoSuchProviderException e) {
            e.printStackTrace();
        }
        return "";
    }

    ////// SHA2 ////////////////////////////////////////////////////

    // return 56bit
    public final static String sha224(String src) {
        try {
            return sha224(src.getBytes(DEFAULT_CHARSET));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return "";
    }

    public final static String sha224(byte[] src) {
        try {
            // MessageDigest md = MessageDigest.getInstance("SHA-224", MadBCConstant.JCE_PROVIDER);
            MessageDigest md = MessageDigest.getInstance("2.16.840.1.101.3.4.2.4", MadBCConstant.JCE_PROVIDER);
            md.update(src);
            return new String(Hex.encodeHex(md.digest()));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (NoSuchProviderException e) {
            e.printStackTrace();
        }
        return null;
    }

    // return 64bit
    public final static String sha256(String src) {
        try {
            return sha256(src.getBytes(DEFAULT_CHARSET));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return "";
    }

    public final static String sha256(byte[] src) {

        try {
            // MessageDigest md = MessageDigest.getInstance("SHA-256", MadBCConstant.JCE_PROVIDER);
            MessageDigest md = MessageDigest.getInstance("2.16.840.1.101.3.4.2.1", MadBCConstant.JCE_PROVIDER);

            md.update(src);
            return new String(Hex.encodeHex(md.digest()));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (NoSuchProviderException e) {
            e.printStackTrace();
        }
        return null;
    }

    // return 96bit
    public final static String sha384(String src) {
        try {
            return sha384(src.getBytes(DEFAULT_CHARSET));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return "";
    }

    public final static String sha384(byte[] src) {
        try {
            // MessageDigest md = MessageDigest.getInstance("SHA-384");
            MessageDigest md = MessageDigest.getInstance("2.16.840.1.101.3.4.2.2", MadBCConstant.JCE_PROVIDER);
            md.update(src);
            return new String(Hex.encodeHex(md.digest()));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (NoSuchProviderException e) {
            e.printStackTrace();
        }
        return "";
    }

    // return 128bit
    public final static String sha512(String src) {
        try {
            return sha512(src.getBytes(DEFAULT_CHARSET));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return "";
    }

    public final static String sha512(byte[] src) {
        try {
            // MessageDigest md = MessageDigest.getInstance("SHA-512");
            MessageDigest md = MessageDigest.getInstance("2.16.840.1.101.3.4.2.3", MadBCConstant.JCE_PROVIDER);
            md.update(src);
            return new String(Hex.encodeHex(md.digest()));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (NoSuchProviderException e) {
            e.printStackTrace();
        }
        return null;
    }

    // return 56bit
    public final static String sha512_224(String src) {
        try {
            return sha512_224(src.getBytes(DEFAULT_CHARSET));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return "";
    }

    public final static String sha512_224(byte[] src) {
        try {
            // MessageDigest md = MessageDigest.getInstance("SHA-512/256");
            MessageDigest md = MessageDigest.getInstance("2.16.840.1.101.3.4.2.5");
            md.update(src);
            return new String(Hex.encodeHex(md.digest()));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return null;
    }

    // return 64bit
    public final static String sha512_256(String src) {
        try {
            return sha512_256(src.getBytes(DEFAULT_CHARSET));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return "";
    }

    public final static String sha512_256(byte[] src) {
        try {
            // MessageDigest md = MessageDigest.getInstance("SHA-512/256");
            MessageDigest md = MessageDigest.getInstance("2.16.840.1.101.3.4.2.6", MadBCConstant.JCE_PROVIDER);
            md.update(src);
            return new String(Hex.encodeHex(md.digest()));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (NoSuchProviderException e) {
            e.printStackTrace();
        }
        return null;
    }

    ////// SHA3 ////////////////////////////////////////////////////

    // return 56bit
    public final static String sha3_224(String src) {
        try {
            return sha3_224(src.getBytes(DEFAULT_CHARSET));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return "";
    }

    public final static String sha3_224(byte[] src) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA3-224", MadBCConstant.JCE_PROVIDER);
            md.update(src);
            return new String(Hex.encodeHex(md.digest()));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (NoSuchProviderException e) {
            e.printStackTrace();
        }
        return null;
    }

    // return 64bit
    public final static String sha3_256(String src) {
        try {
            return sha3_256(src.getBytes(DEFAULT_CHARSET));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return "";
    }

    public final static String sha3_256(byte[] src) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA3-256", MadBCConstant.JCE_PROVIDER);
            md.update(src);
            return new String(Hex.encodeHex(md.digest()));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (NoSuchProviderException e) {
            e.printStackTrace();
        }
        return null;
    }

    // return 96bit
    public final static String sha3_384(String src) {
        try {
            return sha3_384(src.getBytes(DEFAULT_CHARSET));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return "";
    }

    public final static String sha3_384(byte[] src) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA3-384", MadBCConstant.JCE_PROVIDER);
            md.update(src);
            return new String(Hex.encodeHex(md.digest()));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (NoSuchProviderException e) {
            e.printStackTrace();
        }
        return null;
    }

}
