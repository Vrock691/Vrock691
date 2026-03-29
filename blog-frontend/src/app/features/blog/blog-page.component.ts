import { ChangeDetectionStrategy, Component } from '@angular/core';

@Component({
  selector: 'app-blog-page',
  templateUrl: 'blog-page.component.html' ,
  host: {
    class: 'block'
  },
  changeDetection: ChangeDetectionStrategy.OnPush
})
export class BlogPageComponent {}
