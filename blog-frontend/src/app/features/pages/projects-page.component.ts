import { ChangeDetectionStrategy, Component } from '@angular/core';

@Component({
  selector: 'app-projects-page',
  template: "",
  host: {
    class: 'block'
  },
  changeDetection: ChangeDetectionStrategy.OnPush
})
export class ProjectsPageComponent {}
