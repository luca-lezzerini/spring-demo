import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Dto } from './dto';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  messaggio: string = "Messaggio iniziale";

  constructor(private http: HttpClient) { }

  aggiorna() {
    let oss: Observable<Dto> = this.http
      .get<Dto>('http://localhost:8080/saluta');
    oss.subscribe(d => this.messaggio = d.messaggio);
  }
}
