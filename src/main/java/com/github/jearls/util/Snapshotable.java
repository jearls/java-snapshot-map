/**
 * 
 */
package com.github.jearls.util;

/**
 * A snapshotable collection.
 * 
 * @author Johnson Earls
 * @version 0.1.0
 */
public interface Snapshotable {
    /**
     * Takes a snapshot of the snapshotable object. The snapshot is frozen such
     * that modifications cannot be made to it.
     * 
     * @return the snapshot
     */
    public Snapshot takeSnapshot();

    /**
     * Release a snapshot. Neither the snapshot nor its view of the underlying
     * object should be used after this call.
     * 
     * @param snapshot
     *            the snapshot to release
     */
    public void releaseSnapshot(Snapshot snapshot);

    /**
     * <p>
     * Attempt to roll back the underlying object to this snapshot's view. Note
     * - the snapshot is <b>not</b> released even if this succeeds.
     * </p>
     * 
     * <p>
     * A <b>RollbackFailedException</b> will be thrown if the rollback fails for
     * any reason. The most likely cause of this exception would be if another
     * snapshot was taken after this one - only the most recent snapshot may be
     * rolled back.
     * </p>
     * 
     * @param snapshot
     *            the view of the underlying object to roll back to
     * @throws RollbackFailedException
     *             if the rollback fails for any reason
     */
    public void rollbackSnapshot(Snapshot snapshot) throws RollbackFailedException;
}
