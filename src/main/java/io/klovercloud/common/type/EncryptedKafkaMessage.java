package io.klovercloud.common.type;

import java.io.Serializable;

public class EncryptedKafkaMessage implements Serializable {

    private byte[] encryptedSecretKey;
    private byte[] encryptedPayload;
    private Long offset;

    public EncryptedKafkaMessage() {
    }

    public EncryptedKafkaMessage(byte[] encryptedSecretKey, byte[] encryptedPayload) {
        this.encryptedSecretKey = encryptedSecretKey;
        this.encryptedPayload = encryptedPayload;
    }

    public EncryptedKafkaMessage(byte[] encryptedSecretKey, byte[] encryptedPayload, Long offset) {
        this.encryptedSecretKey = encryptedSecretKey;
        this.encryptedPayload = encryptedPayload;
        this.offset = offset;
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

    public Long getOffset() {
        return offset;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }
}
