import { Routes } from '@angular/router';

export const routes: Routes = [
	{
		path: '',
		pathMatch: 'full',
		redirectTo: 'home'
	},
	{
		path: 'home',
		loadComponent: () =>
			import('./features/homepage/home-page.component').then(
				(m) => m.HomePageComponent
			)
	},
	{
		path: 'blog',
		loadComponent: () =>
			import('./features/blog/blog-page.component').then(
				(m) => m.BlogPageComponent
			)
	},
	{
		path: 'projects',
		loadComponent: () =>
			import('./features/projectspage/projects-page.component').then(
				(m) => m.ProjectsPageComponent
			)
	},
	{
		path: 'skills',
		loadComponent: () =>
			import('./features/skillspage/skills-page.component').then(
				(m) => m.SkillsPageComponent
			)
	},
	{
		path: 'journey',
		loadComponent: () =>
			import('./features/journeypage/journey-page.component').then(
				(m) => m.JourneyPageComponent
			)
	},
	{
		path: '**',
		redirectTo: 'home'
	}
];
