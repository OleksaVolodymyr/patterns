package com.epam.patterns.builder;

public class Droid {
	private String name;
	private int health;
	private int attack;

	public static class DroidBuilder {
		private String name;
		private int health;
		private int attack;

		public DroidBuilder setName(String name) {
			this.name = name;
			return this;
		}

		public DroidBuilder setHealth(int health) {
			this.health = health;
			return this;
		}

		public DroidBuilder setAttack(int attack) {
			this.attack = attack;
			return this;
		}

		public Droid build() {
			return new Droid(this);
		}
	}

	private Droid(DroidBuilder builder) {
		name = builder.name;
		health = builder.health;
		attack = builder.attack;
	}

	@Override
	public String toString() {
		return "Droid [name=" + this.name + ", health=" + this.health + ", attack=" + this.attack + "]";
	}

}
