/**
 * 
 */
package com.github.jearls.util;

/**
 * A frozen-in-time view of a Snapshotable object.
 * @author Johnson Earls
 * @version 0.1.0
 */
public interface Snapshot {
    public Snapshotable getView();
}
