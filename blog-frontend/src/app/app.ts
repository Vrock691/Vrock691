import { ChangeDetectionStrategy, Component } from '@angular/core';
import { SidebarComponent } from './shared/components/sidebar/sidebar.component';
import { RouterOutlet } from "@angular/router";

@Component({
  selector: 'app-root',
  imports: [SidebarComponent, RouterOutlet],
  templateUrl: './app.html',
  styleUrl: './app.css',
  changeDetection: ChangeDetectionStrategy.OnPush
})
export class App {}
