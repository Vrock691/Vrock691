import { ChangeDetectionStrategy, Component } from '@angular/core';

@Component({
  selector: 'app-skills-page',
  templateUrl: './skills-page.component.html',
  host: {
    class: 'block'
  },
  changeDetection: ChangeDetectionStrategy.OnPush
})
export class SkillsPageComponent {}
