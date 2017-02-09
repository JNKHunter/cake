package question16;

/**
 * Created by jhunter on 2/9/17.
 */
public class InfinityException extends RuntimeException {
    public InfinityException() {
        super("Max value is infinity!");
    }
}
