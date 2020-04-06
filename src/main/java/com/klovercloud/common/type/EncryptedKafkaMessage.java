package com.klovercloud.common.type;

import java.io.Serializable;

public class EncryptedKafkaMessage implements Serializable {

    private byte[] encryptedSecretKey;
    private byte[] encryptedPayload;


    public EncryptedKafkaMessage() {
    }

    public EncryptedKafkaMessage(byte[] encryptedSecretKey, byte[] encryptedPayload) {
        this.encryptedSecretKey = encryptedSecretKey;
        this.encryptedPayload = encryptedPayload;
    }

    public byte[] getEncryptedSecretKey() {
        return encryptedSecretKey;
    }

    public void setEncryptedSecretKey(byte[] encryptedSecretKey) {
        this.encryptedSecretKey = encryptedSecretKey;
    }

    public byte[] getEncryptedPayload() {
        return encryptedPayload;
    }

    public void setEncryptedPayload(byte[] encryptedPayload) {
        this.encryptedPayload = encryptedPayload;
    }
}
