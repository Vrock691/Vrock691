import { ChangeDetectionStrategy, Component } from '@angular/core';

@Component({
  selector: 'app-skills-page',
  template: "",
  host: {
    class: 'block'
  },
  changeDetection: ChangeDetectionStrategy.OnPush
})
export class SkillsPageComponent {}
