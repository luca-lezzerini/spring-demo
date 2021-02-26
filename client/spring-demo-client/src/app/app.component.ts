import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Dto } from './dto';
import { DtoNumero } from './dto-numero';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  messaggio: string = "Messaggio iniziale";
  numero: number;
  risultato: number;

  constructor(private http: HttpClient) { }

  aggiorna() {
    let oss: Observable<Dto> = this.http
      .get<Dto>('http://localhost:8080/saluta');
    oss.subscribe(d => this.messaggio = d.messaggio);
  }

  raddoppia() {
    let dto: DtoNumero = new DtoNumero();
    dto.numero = this.numero;
    let oss: Observable<DtoNumero> = this.http
      .post<DtoNumero>('http://localhost:8080/moltiplica', 
      dto);
    oss.subscribe(d => this.risultato = d.numero);
  }
}
