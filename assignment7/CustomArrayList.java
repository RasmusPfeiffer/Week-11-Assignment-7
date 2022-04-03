package assignment7;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] aItems = new Object[10];
	int iSize = 0;

	@Override
	public boolean add(T item) {
		if (iSize == aItems.length) {
			aItems = Arrays.copyOf(aItems, aItems.length * 2);
		}
		aItems[iSize] = item;
		this.iSize++;
		return true;
	}

	@Override
	public boolean add(int index, T item) throws IndexOutOfBoundsException {
		if (index >= aItems.length) {
			throw new IndexOutOfBoundsException();
		}
		aItems = Arrays.copyOf(aItems, aItems.length + 1);
		for (int i = aItems.length - 1; i > index; i--) {
			aItems[i] = aItems[i - 1];
		}
		aItems[index] = item;
		this.iSize++;
		return true;
	}

	@Override
	public int getSize() {
		return iSize;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) throws IndexOutOfBoundsException {
		if (index >= aItems.length) {
			throw new IndexOutOfBoundsException();
		}
		return (T) aItems[index];
	}

	@SuppressWarnings("unchecked")
	@Override
	public T remove(int index) throws IndexOutOfBoundsException {
		if (index >= aItems.length) {
			throw new IndexOutOfBoundsException();
		}
		for (int i = index; i < aItems.length - 1; i++) {
			aItems[i] = aItems[i + 1];
		}
		if (aItems[aItems.length-1] != null) {
			aItems = Arrays.copyOf(aItems, aItems.length-1);
		}
		this.iSize--;
		return (T) aItems[index];
	}
}
