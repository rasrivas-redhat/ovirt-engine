package org.ovirt.engine.core.common.action;

import org.ovirt.engine.core.common.AuditLogType;
import org.ovirt.engine.core.common.businessentities.storage.TransferType;
import org.ovirt.engine.core.compat.Guid;

public class TransferDiskImageParameters extends ImagesActionsParametersBase {
    private static final long serialVersionUID = 724300532243034213L;

    // Members used to persist data during command execution
    long sessionExpiration;
    AuditLogType auditLogType;
    long lastPauseLogTime;
    String downloadFilename;
    boolean retryExtendTicket = true;
    private long transferSize;
    private TransferType transferType = TransferType.Upload;
    private AddDiskParameters addDiskParameters;

    public TransferDiskImageParameters() {}

    public TransferDiskImageParameters(Guid storageDomainId, AddDiskParameters addDiskParameters) {
        setStorageDomainId(storageDomainId);
        this.addDiskParameters = addDiskParameters;
    }

    public AddDiskParameters getAddDiskParameters() {
        return addDiskParameters;
    }

    public void setAddDiskParameters(AddDiskParameters addDiskParameters) {
        this.addDiskParameters = addDiskParameters;
    }

    public long getTransferSize() {
        return transferSize;
    }

    public void setTransferSize(long transferSize) {
        this.transferSize = transferSize;
    }

    public long getSessionExpiration() {
        return sessionExpiration;
    }

    public void setSessionExpiration(long sessionExpiration) {
        this.sessionExpiration = sessionExpiration;
    }

    public AuditLogType getAuditLogType() {
        return auditLogType;
    }

    public void setAuditLogType(AuditLogType auditLogType) {
        this.auditLogType = auditLogType;
    }

    public long getLastPauseLogTime() {
        return lastPauseLogTime;
    }

    public void setLastPauseLogTime(long lastPauseLogTime) {
        this.lastPauseLogTime = lastPauseLogTime;
    }

    public TransferType getTransferType() {
        return transferType;
    }

    public void setTransferType(TransferType transferType) {
        this.transferType = transferType;
    }

    public String getDownloadFilename() {
        return downloadFilename;
    }

    public void setDownloadFilename(String downloadFilename) {
        this.downloadFilename = downloadFilename;
    }

    public boolean isRetryExtendTicket() {
        return retryExtendTicket;
    }

    public void setRetryExtendTicket(boolean retryExtendTicket) {
        this.retryExtendTicket = retryExtendTicket;
    }
}
