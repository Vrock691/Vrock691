import { ChangeDetectionStrategy, Component, input, signal } from '@angular/core';
import { RouterModule } from '@angular/router';

export interface SidebarLink {
  label: string;
  route: string;
  iconSrc: string;
  iconAlt: string;
}

@Component({
  selector: 'app-sidebar',
  standalone: true,
  imports: [RouterModule],
  templateUrl: './sidebar.component.html',
  styleUrls: ['./sidebar.component.css'],
  host: {
    class: 'block'
  },
  changeDetection: ChangeDetectionStrategy.OnPush
})
export class SidebarComponent {
  readonly isMenuOpen = signal(false);

  readonly links = input<ReadonlyArray<SidebarLink>>([
    { label: 'Accueil', route: '/home', iconSrc: '/home.svg', iconAlt: 'Icone accueil' },
    { label: "Blog", route: '/blog', iconSrc: '/journal.svg', iconAlt: 'Icone blog' },
    { label: 'Mes projets', route: '/projects', iconSrc: '/code.svg', iconAlt: 'Icone projets' },
    { label: 'Mes competences', route: '/skills', iconSrc: '/skills.svg', iconAlt: 'Icone competences' },
    { label: 'Mon parcours', route: '/journey', iconSrc: '/book.svg', iconAlt: 'Icone parcours' },
  ]);

  toggleMenu(): void {
    this.isMenuOpen.update((isOpen) => !isOpen);
  }

  closeMenu(): void {
    this.isMenuOpen.set(false);
  }
}
