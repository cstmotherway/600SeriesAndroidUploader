package info.nightscout.android.medtronic.message;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import info.nightscout.android.medtronic.MedtronicCnlSession;

/**
 * Created by lgoedhart on 10/05/2016.
 */
public class OpenConnectionResponseMessage extends MedtronicResponseMessage {
    protected OpenConnectionResponseMessage(MedtronicCnlSession pumpSession, byte[] payload) throws ChecksumException, EncryptionException {
        super(pumpSession, payload);
    }

}