interface IBook {
    nPagine: number;
    getBook(x:number): string
}
interface IBook2 {
    nPagine: number;
    getBook2(x:number): string
}

class Book implements IBook, IBook2  {
    getBook2(x: number): string {
        throw new Error("Method not implemented.");
    }
    nPagine: number;
    getBook(): string {
        throw new Error("Method not implemented.");
    }

}