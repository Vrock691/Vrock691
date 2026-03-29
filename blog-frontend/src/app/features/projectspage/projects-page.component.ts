import { ChangeDetectionStrategy, Component } from '@angular/core';

@Component({
  selector: 'app-projects-page',
  templateUrl: 'projects-page.component.html' ,
  host: {
    class: 'block'
  },
  changeDetection: ChangeDetectionStrategy.OnPush
})
export class ProjectsPageComponent {}
