package info.nightscout.android.medtronic.message;

import info.nightscout.android.medtronic.MedtronicCnlSession;

/**
 * Created by lgoedhart on 10/05/2016.
 */
public class CloseConnectionResponseMessage extends MedtronicResponseMessage {
    protected CloseConnectionResponseMessage(MedtronicCnlSession pumpSession, byte[] payload) throws ChecksumException, EncryptionException {
        super(pumpSession, payload);
    }

}