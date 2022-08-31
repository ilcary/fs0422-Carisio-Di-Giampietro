
export class Address{
        street:string;
        city:string;
        country:string;
        zip:number;
        constructor(street:string, city:string, country:string, zip:number) {
            this.street = street;
            this.city = city;
            this.country = country;
            this.zip = zip;
        }
}