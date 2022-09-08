import { Directive, ElementRef, HostListener, Input, Renderer2 } from '@angular/core';

@Directive({
  selector: '[appColora]'
})
export class ColoraDirective {

  constructor(
    private ref:ElementRef,//tag su cui si applica la direttiva
    private renderer:Renderer2
    ) { }


    @HostListener('click') onClick(){
      this.color = 'blue'
      this.renderer.setStyle(this.ref.nativeElement, 'backgroundColor',this.color)
    }

    @HostListener('mouseenter') onMouseEnter(){
      this.renderer.setStyle(this.ref.nativeElement, 'backgroundColor','purple')
    }
    @HostListener('mouseleave') onMouseLeave(){
      this.renderer.setStyle(this.ref.nativeElement, 'backgroundColor','transparent')
    }




    @Input() color:string = 'red'//abilita l'attributo color
    @Input('appColora') fsize:string = '1rem'//abilita l'attributo color

  ngOnInit() {
    //this.ref.nativeElement.style.backgroundColor = 'red'
    this.renderer.setStyle(this.ref.nativeElement, 'backgroundColor',this.color)

    this.renderer.setStyle(this.ref.nativeElement, 'font-size',this.fsize)

    this.renderer.setProperty(this.ref.nativeElement, 'innerText',this.ref.nativeElement.innerText+'modificato')
    console.dir(this.ref.nativeElement)
  }

}
