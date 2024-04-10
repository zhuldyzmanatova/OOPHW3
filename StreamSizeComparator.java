import java.util.Comparator;

public class StreamSizeComparator implements Comparator<Stream> {
    @Override
    public int compare(Stream s1, Stream s2) {
        // return Integer.compare(s1.getNumberOfGroups(), s2.getNumberOfGroups());
        return s1.getNumberOfGroups() - s2.getNumberOfGroups();
    }
}