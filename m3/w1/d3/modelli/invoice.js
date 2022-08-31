"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
class Invoice {
    constructor(billingAddress) {
        var _a;
        this.rows = [];
        this.billingAddress = billingAddress || ((_a = this.user) === null || _a === void 0 ? void 0 : _a.billingAddress);
    }
}
