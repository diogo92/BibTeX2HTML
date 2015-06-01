<#list BookList as BookData>
	<div>
		<ul>
			<li><strong>Key:</strong> ${BookData.citationKey}</li>
			<li><strong>Author:</strong> ${BookData.author}</li>
			<li><strong>Title:</strong> ${BookData.title}</li>
			<li><strong>Publisher:</strong> ${BookData.publisher}</li>
			<li><strong>Year:</strong> ${BookData.year}</li>
			<#if BookData.volume??>
				<li><strong>Volume:</strong> ${BookData.volume}</li>
			</#if>
			<#if BookData.number??>
				<li><strong>Number:</strong> ${BookData.number}</li>
			</#if>
			<#if BookData.edition??>
				<li><strong>Edition:</strong> ${BookData.edition}</li>
			</#if>
			<#if BookData.series??>
				<li><strong>Series:</strong> ${BookData.series}</li>
			</#if>
			<#if BookData.address??>
				<li><strong>Address:</strong> ${BookData.address}</li>
			</#if>
			<#if BookData.month??>
				<li><strong>Month:</strong> ${BookData.month}</li>
			</#if>
			<#if BookData.note??>
				<li><strong>Note:</strong> ${BookData.note}</li>
			</#if>
			<#if BookData.key??>
				<li><strong>Key:</strong> ${BookData.key}</li>
			</#if>
			<#if BookData.crossref??>
				<li><strong>Crossref:</strong> ${BookData.crossref}</li>
			</#if>
		</ul>
	</div>
</#list>