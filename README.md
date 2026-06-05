## 🛡️ Sentinel Multi-Chain Monitoring (v2.0)

*If this research helped you, please consider giving it a ⭐ Star.*


## 🚀 Stay Updated
Found this research useful?
* **Star ⭐** this repo to keep track of it.
* **Follow me** on GitHub for more DeFi security research.
* **Fork** it if you want to run your own experiments.

### ☕ Support the Research
If you appreciate the work and want to support further security research:

<img src="456.PNG" alt="Donate QR" width="200"/>

**Wallet Address (ETH/EVM):** 0xBDDD7973D0DE27B715A4A5cbdb87d0DF78757b3A 


A resilient, high-speed security agent built for real-time invariant monitoring across different blockchain architectures. 

### Supported Protocols & Ecosystems
- **Rhea Finance (EVM / Mantle):** Monitoring Assets-to-Shares vault invariants.
- **Ekubo Protocol (Starknet):** Monitoring "Flash Accounting" deltas and pool reserves following the $1.4M exploit analysis.

### Key Features
- **Multi-Chain Core:** Single Clojure engine polling both EVM and Starknet RPCs simultaneously.
- **Fault-Tolerant Design:** Built-in failover logic and resilient HTTP handling to bypass public RPC rate limits and Cloudflare filters.
- **Invariant Validation:** Detects "Ghost Debt" and unexpected ratio shifts before they can be exploited.

### Tech Stack
- **Monitoring:** Clojure / Leiningen
- **Smart Contracts:** Solidity / Foundry
- **Communication:** JSON-RPC (EVM) & Starknet-RPC

### How to Run
1. Navigate to the monitoring directory:
   ```bash
   cd monitoring
