import { ChangeDetectionStrategy, Component } from '@angular/core';

@Component({
  selector: 'app-journey-page',
  template: "",
  host: {
    class: 'block'
  },
  changeDetection: ChangeDetectionStrategy.OnPush
})
export class JourneyPageComponent {}
