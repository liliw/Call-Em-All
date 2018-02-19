/**
 * @author      Li-Wei Li <email: lily.lsps@gmail.com>
 * @version     1
 */

class Rand11Exception extends Exception {
    public Rand11Exception() {
        super("The number is not between 1 and 11.");
    }
    public Rand11Exception(String message) {
        super(message);
    }
}