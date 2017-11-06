package hw.gorovtsov.gift.entity;

public class JellyCandy extends SweetStuff {
	private int weight; // вес сладости
	private int containsSugar; // количество сахара на 100 г сладости
	private String name; // название сладости
	
	public JellyCandy() {
		this.weight = 10;
		this.containsSugar = 60;
		this.name = "Бешеная пчелка";
	}
	
	public JellyCandy(int weight, int containsSugar, String name) {
		this.weight = weight;
		this.containsSugar = containsSugar;
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 10;
		result = prime * result + containsSugar;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + weight;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (getClass() != obj.getClass())
			return false;
		JellyCandy other = (JellyCandy) obj;
		if (containsSugar != other.containsSugar)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (weight != other.weight)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return name + "[Желейная конфетина | вес =" + weight + ", Сахара на 100г=" + containsSugar + "]";
	}
	
	
}
