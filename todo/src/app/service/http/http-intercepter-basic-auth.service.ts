import { Injectable } from '@angular/core';
import { HttpInterceptor, HttpRequest, HttpHandler, HttpEvent } from '@angular/common/http';
import { BasicAuthenticationService } from '../basic-authentication.service';

@Injectable({
  providedIn: 'root'
})
export class HttpIntercepterBasicAuthService implements HttpInterceptor {

  constructor(private basicAuthenticationService: BasicAuthenticationService) { }

  intercept(request: HttpRequest<any>, next: HttpHandler) {
    // let username = 'in28minutes';
    // let password = 'dummy';
    // let basicAuthHeaderString = 'Basic ' + window.btoa(username + ':' + password);
    // Basic dXNlcjoyMTBkMzIzNS00NTMwLTQ4MWUtOTY4Ny0xODMwNWRhYmUzNTE=

    let basicAuthHeaderString = this.basicAuthenticationService.getAuthenticatedToken();
    let username = this.basicAuthenticationService.getAuthenticatedUser();

    if(basicAuthHeaderString && username) {
      request = request.clone({
        setHeaders: {
          Authorization: basicAuthHeaderString
        }
      });
    }
    
    return next.handle(request);
  }
}

