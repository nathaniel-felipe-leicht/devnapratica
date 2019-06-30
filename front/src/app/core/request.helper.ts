import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { catchError } from 'rxjs/operators';
import { throwError } from 'rxjs';


@Injectable()
export class RequestHelper {
    public headers: HttpHeaders;
  
    constructor(
      protected http: HttpClient
    ) {
      this.http = http;
      this.headers = new HttpHeaders().set('Authorization', 'Bearer dd0b4076f9c64cb62d244359c4d93a70');
    }

    public defaultCatch() {
        return catchError((err: any) => {
          if (err) {
            const summary =  err.status ? String(err.status) : 'Error';
            const detail = (err.error && err.error.message) || err.statusText || err.message || 'Error';
            console.log(summary, detail);
          }
          return throwError(err);
        });
  }
}