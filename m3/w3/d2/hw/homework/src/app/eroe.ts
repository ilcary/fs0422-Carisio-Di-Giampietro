export class Eroe {
  name: string;
  alterEgo: string;
  power: string;
  enemy: string;
  planet: string;
  weakness?: string;

  constructor(
    name: string,
    alterEgo: string,
    power: string,
    enemy: string,
    planet: string,
    weakness: string
  ) {
    this.name = name;
    this.alterEgo = alterEgo;
    this.power = power;
    this.enemy = enemy;
    this.planet = planet;
    this.weakness = weakness;
  }
}
