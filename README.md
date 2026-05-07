## 🛡️ Sentinel Multi-Chain Monitoring (v2.0)

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
