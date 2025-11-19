<!doctype html>
<html lang="en">
<head>
  <meta charset="utf-8" />
  <meta name="viewport" content="width=device-width,initial-scale=1" />
  <title>Book Manager (HTML + JS)</title>
  <style>
    body { font-family: Arial, Helvetica, sans-serif; max-width: 960px; margin: 24px auto; padding: 0 16px; }
    h1 { color: #2c3e50; }
    form { display: grid; gap: 8px; grid-template-columns: 1fr 1fr; align-items: center; margin-bottom: 16px; }
    label { display:block; font-size: 0.9rem; margin-bottom:4px; }
    input[type="text"], input[type="number"] { width:100%; padding:8px; box-sizing:border-box; }
    .full { grid-column: 1 / -1; display:flex; gap:8px; }
    button { padding:8px 12px; cursor:pointer; }
    table { width:100%; border-collapse:collapse; margin-top:8px; }
    th, td { text-align:left; padding:8px; border:1px solid #ddd; }
    tr:nth-child(even) { background:#f9f9f9; }
    .small { font-size:0.9rem; color:#666; }
    .actions button { margin-right:6px; }
    .error { color:#c0392b; font-weight:600; }
  </style>
</head>
<body>
  <h1>Book Manager</h1>
  <p class="small">This page mirrors your <code>Book</code> Java model: barcode, name, author, price &amp; quantity. Books are stored
