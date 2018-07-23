import { Injectable } from '@angular/core';
import {Http, Response, Headers, RequestOptions} from '@angular/http';
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/catch';
import 'rxjs/add/observable/throw';
import {Observable} from 'rxjs/Observable';
import{Question}  from '../question';
import { HttpClient } from '@angular/common/http';
@Injectable({
  providedIn: 'root'
})
export class QuestionService {

  private baseUrlProxyShouldBe: string='http://localhost:8080/'; //todo proxy

  private baseUrl = this.baseUrlProxyShouldBe + 'api/questions/';
    
  constructor(private http: HttpClient) {
  }

  getQuestions(id: Number): Observable<Question[]> {
    return this.http.get<Question[]>(this.baseUrl + '/question/' + id);
  }  
}