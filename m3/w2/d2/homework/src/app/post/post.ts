
export class PostModule {
  constructor(
   public userId: number|string,
   public title:string,
   public body:string,
   public active:boolean=true,
   public like:number=0){}
 }
