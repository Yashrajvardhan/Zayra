import { TestBed } from '@angular/core/testing';

import { ZayraService } from './zayra-service';

describe('ZayraService', () => {
  let service: ZayraService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ZayraService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
