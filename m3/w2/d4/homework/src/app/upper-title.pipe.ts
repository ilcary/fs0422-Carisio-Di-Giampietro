import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'upperTitle'
})
export class UpperTitlePipe implements PipeTransform {

  transform(value: string, ...args: unknown[]): string {
    return value.toUpperCase();
  }

}
