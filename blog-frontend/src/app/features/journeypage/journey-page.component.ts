import { ChangeDetectionStrategy, Component } from '@angular/core';

@Component({
  selector: 'app-journey-page',
  templateUrl: 'journey-page.component.html' ,
  host: {
    class: 'block'
  },
  changeDetection: ChangeDetectionStrategy.OnPush
})
export class JourneyPageComponent {}
