package ironpeace.batchapp.csBatch.cleansingSampleJobFlow.stage0002;
import org.apache.hadoop.mapreduce.Partitioner;
/**
 * ステージ#2シャッフルで利用するパーティショナー。
 */
@SuppressWarnings("deprecation") public final class ShufflePartitioner extends Partitioner<ShuffleKey, ShuffleValue> {
    @Override public int getPartition(ShuffleKey key, ShuffleValue value, int numPartitions) {
        return(this.getHashCode(key) & Integer.MAX_VALUE) % numPartitions;
    }
    private int getHashCode(ShuffleKey key) {
        int portId = key.getSegmentId();
        int result = this.portIdToElementId(portId);
        switch(portId) {
            case 1:
                result = result * 31 + key.groupElem0Term1.hashCode();
                break;
            case 2:
                result = result * 31 + key.groupElem0Term1.hashCode();
                break;
            default:
                throw new AssertionError(portId);
        }
        return result;
    }
    private int portIdToElementId(int pid) {
        switch(pid) {
            case 1:
            case 2:
                return 0;
            default:
                return -1;
        }
    }
}