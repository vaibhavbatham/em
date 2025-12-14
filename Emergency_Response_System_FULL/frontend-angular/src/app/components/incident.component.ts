import {Component} from '@angular/core';
import {IncidentService} from '../services/incident.service';
@Component({
 selector:'app-incident',
 template:`<input [(ngModel)]="type"><input [(ngModel)]="location">
 <input [(ngModel)]="severity"><button (click)="send()">Report</button>`
})
export class IncidentComponent{
 type='';location='';severity='';
 constructor(private s:IncidentService){}
 send(){this.s.report({type:this.type,location:this.location,severity:this.severity}).subscribe();}
}