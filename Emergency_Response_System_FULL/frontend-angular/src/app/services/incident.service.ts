import {HttpClient} from '@angular/common/http';
import {Injectable} from '@angular/core';
@Injectable({providedIn:'root'})
export class IncidentService{
 api='http://localhost:8080/api/incidents';
 constructor(private http:HttpClient){}
 report(d:any){return this.http.post(this.api,d);}
}