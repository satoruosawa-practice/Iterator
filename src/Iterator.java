public interface Iterator {
	public abstract Object current();
	public abstract boolean hasNext();
	public abstract Object next();
	public abstract boolean hasPrevious();
	public abstract Object previous();
	public abstract Object jump(int index);
}
