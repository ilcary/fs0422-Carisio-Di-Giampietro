import { NgModule } from '@angular/core';
import { PrimiListComponent } from './primi-list/primi-list.component';
import { PrimiDetailComponent } from './primi-detail/primi-detail.component';
import { PrimiItemComponent } from './primi-item/primi-item.component';
import { PrimiComponent } from './primi/primi.component';
import { PrimiRoutingModule } from './primi-routing.module';
import { SharedModule } from '../shared/shared.module';



@NgModule({
  declarations: [
    PrimiListComponent,
    PrimiDetailComponent,
    PrimiItemComponent,
    PrimiComponent
  ],
  imports: [
    PrimiRoutingModule,
    SharedModule
  ],
})
export class PrimiModule { }
