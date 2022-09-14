export interface Post{
    id:number,
    title:string,
    body:string,
    active:boolean,
    type: 'news' | 'politic' | 'education',
    author:string
}