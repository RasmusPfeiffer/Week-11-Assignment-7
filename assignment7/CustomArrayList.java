package assignment7;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] aItems = new Object[10];

	@Override
	public boolean add(T item) {
		for (int i = 0; i < aItems.length; i++) {
			if (aItems[i] == null) {
				aItems[i] = item;
				return true;
			} else if (aItems[aItems.length - 1] != null) {
				aItems = Arrays.copyOf(aItems, aItems.length * 2);
			}
		}
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
		return false;
	}

	@Override
	public int getSize() {
		int i = 0;
		while (i < aItems.length && aItems[i] != null) {
			i++;
		}
		return i;

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
		return null;
	}

}
