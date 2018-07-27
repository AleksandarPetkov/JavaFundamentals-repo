package Lecture_OpenClosedLiskovPrinciples_Lab.p02_FileStream;

public class StreamProgressInfo {
    private Streamable streamable;


    public StreamProgressInfo(Streamable argument) {
        this.streamable = argument;
    }

    public int calculateCurrentPercent() {
        return (this.streamable.getBytesSent() * 100) / this.streamable.getLength();
    }
}
