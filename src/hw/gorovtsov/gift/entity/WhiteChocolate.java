package hw.gorovtsov.gift.entity;

public class WhiteChocolate extends SweetStuff{
	
	
	public WhiteChocolate() {
		this.setWeight(100);
		this.setContainsSugar(65);
		this.setName("Русский шоколад");
	}
	
	public WhiteChocolate(int weight, int containsSugar, String name) {
		this.setWeight(weight);
		this.setContainsSugar(containsSugar);
		this.setName(name);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + getContainsSugar();
		result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
		result = prime * result + getWeight();
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		WhiteChocolate other = (WhiteChocolate) obj;
		if (getContainsSugar() != other.getContainsSugar())
			return false;
		if (getName() == null) {
			if (other.getName() != null)
				return false;
		} else if (!getName().equals(other.getName()))
			return false;
		if (getWeight() != other.getWeight())
			return false;
		return true;
	}
	
	public String toString() {
		return getName() + "[Белая шоколадка | вес =" + getWeight() + ", Сахара на 100г=" + getContainsSugar() + "]";
	}
}
