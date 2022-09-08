import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'cut'
})
export class CutPipe implements PipeTransform {

  transform(value: any, limit: number = 10): any {
    return value.substr(0,limit)+'...';
  }

}
