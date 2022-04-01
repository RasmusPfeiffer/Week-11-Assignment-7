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
		return false;
	}

	@Override
	public boolean add(int index, T item) throws IndexOutOfBoundsException {
		aItems[index] = item;
		if (index == aItems.length - 1) {
			aItems = Arrays.copyOf(aItems, aItems.length + 1);
		}
		for (int i = aItems.length - 1; i > index; i--) {
			aItems[i] = aItems[i - 1];
		}
		this.iSize++;
		return false;
	}

	@Override
	public int getSize() {
		return iSize;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) throws IndexOutOfBoundsException {
		return (T) aItems[index];
	}

	@Override
	public T remove(int index) throws IndexOutOfBoundsException {
		aItems[index] = null;
		for (int i = index; i < aItems.length - 2; i++) {
			aItems[i] = aItems[i + 1];
		}
		this.iSize--;
		return null;
	}
}
