import { HttpClient } from '@angular/common/http';
import { RequestHelper } from '../request.helper';

export class EntityService<T> extends RequestHelper {
  constructor(
    protected http: HttpClient,
    protected entityUrl: string,
  ) {
    super(
      http
    )
    this.entityUrl = entityUrl;
  }

  public list() {
    return this.http.get<T[]>(this.entityUrl, {headers: this.headers} ).pipe(this.defaultCatch());
  }

  public get(id: any) {
    return this.http.get<T[]>(`${this.entityUrl}/${id}`, {headers: this.headers}).pipe(this.defaultCatch());
  }

  public insert(entity: T) {
    return this.http.post<T[]>(this.entityUrl, entity, {headers: this.headers}).pipe(this.defaultCatch());
  }

  public update(id: any, entity: T) {
    return this.http.put<T[]>(`${this.entityUrl}/${id}`, entity, {headers: this.headers}).pipe(this.defaultCatch());
  }

  public delete(id: any) {
    return this.http.delete<T[]>(`${this.entityUrl}/${id}`, {headers: this.headers}).pipe(this.defaultCatch());
  }
}

